package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScriptInput extends js.Object {
  /**
    * Descriptive label that is associated with a script. Script names do not need to be unique. You can use UpdateScript to change this value later. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same region where you want to create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on, you can use the ObjectVersion parameter to specify an earlier version. 
    */
  var StorageLocation: js.UndefOr[S3Location] = js.undefined
  /**
    * Version that is associated with a build or script. Version strings do not need to be unique. You can use UpdateScript to change this value later. 
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or multiple files. Maximum size of a zip file is 5 MB. When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended with the string "fileb://" to indicate that the file data is a binary object. For example: --zip-file fileb://myRealtimeScript.zip.
    */
  var ZipFile: js.UndefOr[ZipBlob] = js.undefined
}

object CreateScriptInput {
  @scala.inline
  def apply(
    Name: NonZeroAndMaxString = null,
    StorageLocation: S3Location = null,
    Version: NonZeroAndMaxString = null,
    ZipFile: ZipBlob = null
  ): CreateScriptInput = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(StorageLocation)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    if (ZipFile != null) __obj.updateDynamic("ZipFile")(ZipFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScriptInput]
  }
}

