package typings.annyang

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Annyang extends StObject {
    
    /**
      * Stop listening, and turn off mic.
      *
      */
    def abort(): Unit = js.native
    
    def addCallback(
      event: Events,
      callback: js.Function3[
          /* userSaid */ js.UndefOr[String], 
          /* commandText */ js.UndefOr[String], 
          /* results */ js.UndefOr[js.Array[String]], 
          Unit
        ]
    ): Unit = js.native
    def addCallback(
      event: Events,
      callback: js.Function3[
          /* userSaid */ js.UndefOr[String], 
          /* commandText */ js.UndefOr[String], 
          /* results */ js.UndefOr[js.Array[String]], 
          Unit
        ],
      context: js.Any
    ): Unit = js.native
    
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
    def addCommands(commands: CommandOption): Unit = js.native
    
    /**
      * Turn on output of debug messages to the console. Ugly, but super-handy!
      *
      * @param [newState=true] Turn on/off debug messages
      */
    def debug(): Unit = js.native
    def debug(newState: Boolean): Unit = js.native
    
    /**
      * Returns the instance of the browser's SpeechRecognition object used by annyang.
      * Useful in case you want direct access to the browser's Speech Recognition engine.
      */
    def getSpeechRecognizer(): js.Any = js.native
    
    /**
      * Returns true if speech recognition is currently on.
      * Returns false if speech recognition is off or annyang is paused.
      */
    def isListening(): Boolean = js.native
    
    /**
      * Pause listening. annyang will stop responding to commands (until the resume or start methods are called), without turning off the browser's SpeechRecognition engine or the mic.
      *
      */
    def pause(): Unit = js.native
    
    def removeCallback(): Unit = js.native
    def removeCallback(
      event: js.UndefOr[scala.Nothing],
      callback: js.Function3[/* userSaid */ String, /* commandText */ String, /* results */ js.Array[String], Unit]
    ): Unit = js.native
    def removeCallback(event: Events): Unit = js.native
    def removeCallback(
      event: Events,
      callback: js.Function3[/* userSaid */ String, /* commandText */ String, /* results */ js.Array[String], Unit]
    ): Unit = js.native
    
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
    def removeCommands(): Unit = js.native
    def removeCommands(command: String): Unit = js.native
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
    def removeCommands(command: js.Array[String]): Unit = js.native
    
    /**
      * Resumes listening and restores command callback execution when a result matches.
      * If SpeechRecognition was aborted (stopped), start it.
      *
      */
    def resume(): Unit = js.native
    
    /**
      * Set the language the user will speak in. If this method is not called, defaults to 'en-US'.
      *
      * @see [Languages](https://github.com/TalAter/annyang/blob/master/docs/FAQ.md#what-languages-are-supported)
      */
    def setLanguage(lang: String): Unit = js.native
    
    /**
      * Start listening.
      * It's a good idea to call this after adding some commands first, but not mandatory.
      */
    def start(): Unit = js.native
    def start(options: StartOptions): Unit = js.native
    
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
    def trigger(command: String): Unit = js.native
    def trigger(command: js.Array[String]): Unit = js.native
  }
  
  type CommandOption = StringDictionary[CommandOptionRegex | js.Function0[Unit]]
  
  @js.native
  trait CommandOptionRegex extends StObject {
    
    def callback(): Unit = js.native
    
    var regexp: RegExp = js.native
  }
  object CommandOptionRegex {
    
    @scala.inline
    def apply(callback: () => Unit, regexp: RegExp): CommandOptionRegex = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandOptionRegex]
    }
    
    @scala.inline
    implicit class CommandOptionRegexMutableBuilder[Self <: CommandOptionRegex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegexp(value: RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.annyang.annyangStrings.start
    - typings.annyang.annyangStrings.soundstart
    - typings.annyang.annyangStrings.error
    - typings.annyang.annyangStrings.end
    - typings.annyang.annyangStrings.result
    - typings.annyang.annyangStrings.resultMatch
    - typings.annyang.annyangStrings.resultNoMatch
    - typings.annyang.annyangStrings.errorNetwork
    - typings.annyang.annyangStrings.errorPermissionBlocked
    - typings.annyang.annyangStrings.errorPermissionDenied
  */
  trait Events extends StObject
  object Events {
    
    @scala.inline
    def end: typings.annyang.annyangStrings.end = "end".asInstanceOf[typings.annyang.annyangStrings.end]
    
    @scala.inline
    def error: typings.annyang.annyangStrings.error = "error".asInstanceOf[typings.annyang.annyangStrings.error]
    
    @scala.inline
    def errorNetwork: typings.annyang.annyangStrings.errorNetwork = "errorNetwork".asInstanceOf[typings.annyang.annyangStrings.errorNetwork]
    
    @scala.inline
    def errorPermissionBlocked: typings.annyang.annyangStrings.errorPermissionBlocked = "errorPermissionBlocked".asInstanceOf[typings.annyang.annyangStrings.errorPermissionBlocked]
    
    @scala.inline
    def errorPermissionDenied: typings.annyang.annyangStrings.errorPermissionDenied = "errorPermissionDenied".asInstanceOf[typings.annyang.annyangStrings.errorPermissionDenied]
    
    @scala.inline
    def result: typings.annyang.annyangStrings.result = "result".asInstanceOf[typings.annyang.annyangStrings.result]
    
    @scala.inline
    def resultMatch: typings.annyang.annyangStrings.resultMatch = "resultMatch".asInstanceOf[typings.annyang.annyangStrings.resultMatch]
    
    @scala.inline
    def resultNoMatch: typings.annyang.annyangStrings.resultNoMatch = "resultNoMatch".asInstanceOf[typings.annyang.annyangStrings.resultNoMatch]
    
    @scala.inline
    def soundstart: typings.annyang.annyangStrings.soundstart = "soundstart".asInstanceOf[typings.annyang.annyangStrings.soundstart]
    
    @scala.inline
    def start: typings.annyang.annyangStrings.start = "start".asInstanceOf[typings.annyang.annyangStrings.start]
  }
  
  @js.native
  trait StartOptions extends StObject {
    
    /**
      * Should annyang restart itself if it is closed indirectly, because of silence or window conflicts?
      */
    var autoRestart: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow forcing continuous mode on or off. Annyang is pretty smart about this, so only set this if you know what you're doing.
      */
    var continuous: js.UndefOr[Boolean] = js.native
  }
  object StartOptions {
    
    @scala.inline
    def apply(): StartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOptions]
    }
    
    @scala.inline
    implicit class StartOptionsMutableBuilder[Self <: StartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRestart(value: Boolean): Self = StObject.set(x, "autoRestart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRestartUndefined: Self = StObject.set(x, "autoRestart", js.undefined)
      
      @scala.inline
      def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    }
  }
}
