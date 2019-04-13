package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceHolder extends js.Object {
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  def cancel(): scala.Unit
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  def detach(): scala.Unit
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  def hideOtherMarkers(): scala.Unit
  def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  def onCursorChange(): scala.Unit
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  def onUpdate(): scala.Unit
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  def setup(): scala.Unit
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  def showOtherMarkers(): scala.Unit
}

@JSGlobal("AceAjax.PlaceHolder")
@js.native
class PlaceHolderCls protected () extends PlaceHolder {
  def this(session: IEditSession, length: scala.Double, pos: Position, positions: js.Array[Position]) = this()
  /**
    * - @param session (Document): The document to associate with the anchor
    * - @param length (Number): The starting row position
    * - @param pos (Number): The starting column position
    * - @param others (String):
    * - @param mainClass (String):
    * - @param othersClass (String):
    **/
  def this(session: Document, length: scala.Double, pos: scala.Double, others: java.lang.String, mainClass: java.lang.String, othersClass: java.lang.String) = this()
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  /* CompleteClass */
  override def detach(): scala.Unit = js.native
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  /* CompleteClass */
  override def hideOtherMarkers(): scala.Unit = js.native
  /* CompleteClass */
  override def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit = js.native
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  /* CompleteClass */
  override def onCursorChange(): scala.Unit = js.native
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  /* CompleteClass */
  override def onUpdate(): scala.Unit = js.native
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  /* CompleteClass */
  override def setup(): scala.Unit = js.native
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  /* CompleteClass */
  override def showOtherMarkers(): scala.Unit = js.native
}

@JSGlobal("AceAjax.PlaceHolder")
@js.native
object PlaceHolder
  extends /**
  * - @param session (Document): The document to associate with the anchor
  * - @param length (Number): The starting row position
  * - @param pos (Number): The starting column position
  * - @param others (String):
  * - @param mainClass (String):
  * - @param othersClass (String):
  **/
org.scalablytyped.runtime.Instantiable6[
      /* session */ Document, 
      /* length */ scala.Double, 
      /* pos */ scala.Double, 
      /* others */ java.lang.String, 
      /* mainClass */ java.lang.String, 
      /* othersClass */ java.lang.String, 
      PlaceHolder
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* session */ IEditSession, 
      /* length */ scala.Double, 
      /* pos */ Position, 
      /* positions */ js.Array[Position], 
      PlaceHolder
    ]

