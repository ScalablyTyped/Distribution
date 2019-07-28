package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookInstanceLifecycleHook extends js.Object {
  /**
    * A base64-encoded string that contains a shell script for a notebook instance lifecycle configuration.
    */
  var Content: js.UndefOr[NotebookInstanceLifecycleConfigContent] = js.undefined
}

object NotebookInstanceLifecycleHook {
  @scala.inline
  def apply(Content: NotebookInstanceLifecycleConfigContent = null): NotebookInstanceLifecycleHook = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content)
    __obj.asInstanceOf[NotebookInstanceLifecycleHook]
  }
}

