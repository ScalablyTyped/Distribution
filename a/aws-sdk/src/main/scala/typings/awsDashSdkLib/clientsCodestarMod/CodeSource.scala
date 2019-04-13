package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeSource extends js.Object {
  /**
    * Information about the Amazon S3 location where the source code files provided with the project request are stored. 
    */
  var s3: S3Location
}

object CodeSource {
  @scala.inline
  def apply(s3: S3Location): CodeSource = {
    val __obj = js.Dynamic.literal(s3 = s3)
  
    __obj.asInstanceOf[CodeSource]
  }
}

