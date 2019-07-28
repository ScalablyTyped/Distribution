package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentDefaultVersionDescription extends js.Object {
  /**
    * The default version of the document.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The default version of the artifact associated with the document.
    */
  var DefaultVersionName: js.UndefOr[DocumentVersionName] = js.undefined
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[DocumentName] = js.undefined
}

object DocumentDefaultVersionDescription {
  @scala.inline
  def apply(
    DefaultVersion: DocumentVersion = null,
    DefaultVersionName: DocumentVersionName = null,
    Name: DocumentName = null
  ): DocumentDefaultVersionDescription = {
    val __obj = js.Dynamic.literal()
    if (DefaultVersion != null) __obj.updateDynamic("DefaultVersion")(DefaultVersion)
    if (DefaultVersionName != null) __obj.updateDynamic("DefaultVersionName")(DefaultVersionName)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[DocumentDefaultVersionDescription]
  }
}

