package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AceAjax.Editor")
@js.native
class EditorCls protected () extends Editor {
  /**
    * Creates a new `Editor` object.
    * @param renderer Associated `VirtualRenderer` that draws everything
    * @param session The `EditSession` to refer to
    **/
  def this(renderer: VirtualRenderer) = this()
  def this(renderer: VirtualRenderer, session: IEditSession) = this()
  /**
    * Get a Configuration Option
    **/
  /* CompleteClass */
  override def getOption(name: String): js.Any = js.native
  /**
    * Get Configuration Options
    **/
  /* CompleteClass */
  override def getOptions(): js.Any = js.native
  /**
    * Sets a Configuration Option
    **/
  /* CompleteClass */
  override def setOption(optionName: String, optionValue: js.Any): Unit = js.native
  /**
    * Sets Configuration Options
    **/
  /* CompleteClass */
  override def setOptions(keyValueTuples: js.Any): Unit = js.native
}

