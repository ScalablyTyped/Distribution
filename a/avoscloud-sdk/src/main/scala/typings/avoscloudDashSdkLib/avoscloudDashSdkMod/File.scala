package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A AV.File is a local representation of a file that is saved to the AV
     * cloud.
     * @class
     * @param name {String} The file's name. This will be prefixed by a unique
     *     value once the file has finished saving. The file name must begin with
     *     an alphanumeric character, and consist of alphanumeric characters,
     *     periods, spaces, underscores, or dashes.
     * @param data {Array} The data for the file, as either:
     *     1. an Array of byte value Numbers, or
     *     2. an Object like { base64: "..." } with a base64-encoded String.
     *     3. a File object selected with a file upload control. (3) only works
     *        in Firefox 3.6+, Safari 6.0.2+, Chrome 7+, and IE 10+.
     *        For example:<pre>
     * var fileUploadControl = $("#profilePhotoFileUpload")[0];
     * if (fileUploadControl.files.length > 0) {
     *   var file = fileUploadControl.files[0];
     *   var name = "photo.jpg";
     *   var AVFile = new AV.File(name, file);
     *   AVFile.save().then(function() {
     *     // The file has been saved to AV.
     *   }, function(error) {
     *     // The file either could not be read, or could not be saved to AV.
     *   });
     * }</pre>
     * @param type {String} Optional Content-Type header to use for the file. If
     *     this is omitted, the content type will be inferred from the name's
     *     extension.
     */
@JSImport("avoscloud-sdk", "File")
@js.native
class File protected ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.File {
  def this(name: java.lang.String, data: js.Any) = this()
  def this(name: java.lang.String, data: js.Any, `type`: java.lang.String) = this()
}

