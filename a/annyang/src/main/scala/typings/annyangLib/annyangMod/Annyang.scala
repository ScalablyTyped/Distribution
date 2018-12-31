package typings
package annyangLib.annyangMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annyang extends js.Object {
  /**
    * Stop listening, and turn off mic.
    *
    */
  def abort(): scala.Unit = js.native
  def addCallback(
    event: Events,
    callback: js.Function3[
      /* userSaid */ js.UndefOr[java.lang.String], 
      /* commandText */ js.UndefOr[java.lang.String], 
      /* results */ js.UndefOr[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addCallback(
    event: Events,
    callback: js.Function3[
      /* userSaid */ js.UndefOr[java.lang.String], 
      /* commandText */ js.UndefOr[java.lang.String], 
      /* results */ js.UndefOr[js.Array[java.lang.String]], 
      scala.Unit
    ],
    context: js.Any
  ): scala.Unit = js.native
  /**
    * Add commands that annyang will respond to. Similar in syntax to init(), but doesn't remove existing commands.
    *
    * #### Examples:
    * ````javascript
    * var commands = {'hello :name': helloFunction, 'howdy': helloFunction};
    * var commands2 = {'hi': helloFunction};
    *
    * annyang.addCommands(commands);
    * annyang.addCommands(commands2);
    * // annyang will now listen to all three commands
    * ````
    */
  def addCommands(commands: CommandOption): scala.Unit = js.native
  /**
    * Turn on output of debug messages to the console. Ugly, but super-handy!
    *
    * @param [newState=true] Turn on/off debug messages
    */
  def debug(): scala.Unit = js.native
  def debug(newState: scala.Boolean): scala.Unit = js.native
  /**
    * Returns the instance of the browser's SpeechRecognition object used by annyang.
    * Useful in case you want direct access to the browser's Speech Recognition engine.
    */
  def getSpeechRecognizer(): js.Any = js.native
  /**
    * Returns true if speech recognition is currently on.
    * Returns false if speech recognition is off or annyang is paused.
    */
  def isListening(): scala.Boolean = js.native
  /**
    * Pause listening. annyang will stop responding to commands (until the resume or start methods are called), without turning off the browser's SpeechRecognition engine or the mic.
    *
    */
  def pause(): scala.Unit = js.native
  def removeCallback(): scala.Unit = js.native
  def removeCallback(event: Events): scala.Unit = js.native
  def removeCallback(
    event: Events,
    callback: js.Function3[
      /* userSaid */ java.lang.String, 
      /* commandText */ java.lang.String, 
      /* results */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Removes all existing commands or a specific command
    * #### Examples:
    * ````javascript
    * var commands : annyang.CommandOption = {'hello': helloFunction, 'howdy': helloFunction, 'hi': helloFunction};
    *
    * // Don't respond to hello
    * annyang.removeCommands('hello');
    *
    * // Remove all existing commands
    * annyang.removeCommands();
    * ````
    */
  def removeCommands(): scala.Unit = js.native
  def removeCommands(command: java.lang.String): scala.Unit = js.native
  /**
    * Removes a list of commands
    * #### Examples:
    * ````javascript
    * var commands : annyang.CommandOption = {'hello': helloFunction, 'howdy': helloFunction, 'hi': helloFunction};
    * // Add some commands
    * annyang.addCommands(commands);
    * // Don't respond to howdy or hi
    * annyang.removeCommands(['howdy', 'hi']);
    * ````
    */
  def removeCommands(command: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Resumes listening and restores command callback execution when a result matches.
    * If SpeechRecognition was aborted (stopped), start it.
    *
    */
  def resume(): scala.Unit = js.native
  /**
    * Set the language the user will speak in. If this method is not called, defaults to 'en-US'.
    *
    * @see [Languages](https://github.com/TalAter/annyang/blob/master/docs/FAQ.md#what-languages-are-supported)
    */
  def setLanguage(lang: java.lang.String): scala.Unit = js.native
  /**
    * Start listening.
    * It's a good idea to call this after adding some commands first, but not mandatory.
    */
  def start(): scala.Unit = js.native
  def start(options: StartOptions): scala.Unit = js.native
  /**
    * Simulate speech being recognized. This will trigger the same events and behavior as when the Speech Recognition
    * detects speech.
    *
    * Can accept either a string containing a single sentence, or an array containing multiple sentences to be checked
    * in order until one of them matches a command (similar to the way Speech Recognition Alternatives are parsed)
    *
    * #### Examples:
    * ````javascript
    * annyang.trigger('Time for some thrilling heroics');
    * annyang.trigger(
    *     ['Time for some thrilling heroics', 'Time for some thrilling aerobics']
    *   );
    * ````
    */
  def trigger(command: java.lang.String): scala.Unit = js.native
  def trigger(command: js.Array[java.lang.String]): scala.Unit = js.native
}

