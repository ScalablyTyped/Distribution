package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationVersionMessage extends js.Object {
  /**
    * The name of the application to which the version belongs.
    */
  var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ApplicationName
  /**
    * Set to true to delete the source bundle from your storage bucket. Otherwise, the application version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
    */
  var DeleteSourceBundle: js.UndefOr[DeleteSourceBundle] = js.undefined
  /**
    * The label of the version to delete.
    */
  var VersionLabel: awsDashSdkLib.clientsElasticbeanstalkMod.VersionLabel
}

object DeleteApplicationVersionMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    VersionLabel: VersionLabel,
    DeleteSourceBundle: js.UndefOr[DeleteSourceBundle] = js.undefined
  ): DeleteApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, VersionLabel = VersionLabel)
    if (!js.isUndefined(DeleteSourceBundle)) __obj.updateDynamic("DeleteSourceBundle")(DeleteSourceBundle)
    __obj.asInstanceOf[DeleteApplicationVersionMessage]
  }
}

