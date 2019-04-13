package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AceAjax.EditSession")
@js.native
class EditSession protected () extends IEditSession {
  /**
    * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
    * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
    * @param mode [The inital language mode to use for the document]{: #modeParam}
    **/
  def this(text: java.lang.String) = this()
  def this(text: js.Array[java.lang.String]) = this()
  def this(content: java.lang.String, mode: java.lang.String) = this()
  def this(text: java.lang.String, mode: TextMode) = this()
  def this(text: js.Array[java.lang.String], mode: java.lang.String) = this()
  /**
    * Get a Configuration Option
    **/
  /* CompleteClass */
  override def getOption(name: java.lang.String): js.Any = js.native
  /**
    * Get Configuration Options
    **/
  /* CompleteClass */
  override def getOptions(): js.Any = js.native
  /**
    * Sets a Configuration Option
    **/
  /* CompleteClass */
  override def setOption(optionName: java.lang.String, optionValue: js.Any): scala.Unit = js.native
  /**
    * Sets Configuration Options
    **/
  /* CompleteClass */
  override def setOptions(keyValueTuples: js.Any): scala.Unit = js.native
}

@JSGlobal("AceAjax.EditSession")
@js.native
object EditSession
  extends org.scalablytyped.runtime.Instantiable2[
      (/* text */ js.Array[java.lang.String]) | (/* text */ java.lang.String), 
      (/* mode */ java.lang.String) | (/* mode */ TextMode), 
      IEditSession
    ]
     with /**
  * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
  * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
  * @param mode [The inital language mode to use for the document]{: #modeParam}
  **/
org.scalablytyped.runtime.Instantiable1[
      (/* text */ js.Array[java.lang.String]) | (/* text */ java.lang.String), 
      IEditSession
    ]

