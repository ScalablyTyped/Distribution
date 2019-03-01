package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Applicationvndamazonawscardgeneric extends js.Object {
  var contentType: awsDashLambdaLib.awsDashLambdaLibStrings.`application/vndDOTamazonawsDOTcardDOTgeneric`
  var genericAttachments: js.Array[awsDashLambdaLib.awsDashLambdaMod.LexGenericAttachment]
  var version: scala.Double
}

object Anon_Applicationvndamazonawscardgeneric {
  @scala.inline
  def apply(
    contentType: awsDashLambdaLib.awsDashLambdaLibStrings.`application/vndDOTamazonawsDOTcardDOTgeneric`,
    genericAttachments: js.Array[awsDashLambdaLib.awsDashLambdaMod.LexGenericAttachment],
    version: scala.Double
  ): Anon_Applicationvndamazonawscardgeneric = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("genericAttachments")(genericAttachments)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Applicationvndamazonawscardgeneric]
  }
}

