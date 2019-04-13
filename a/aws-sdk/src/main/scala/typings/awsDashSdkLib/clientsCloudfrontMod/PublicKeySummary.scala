package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeySummary extends js.Object {
  /**
    *  Comment for public key information summary. 
    */
  var Comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Creation time for public key information summary. 
    */
  var CreatedTime: timestamp
  /**
    *  Encoded key for public key information summary. 
    */
  var EncodedKey: java.lang.String
  /**
    *  ID for public key information summary. 
    */
  var Id: java.lang.String
  /**
    *  Name for public key information summary. 
    */
  var Name: java.lang.String
}

object PublicKeySummary {
  @scala.inline
  def apply(
    CreatedTime: timestamp,
    EncodedKey: java.lang.String,
    Id: java.lang.String,
    Name: java.lang.String,
    Comment: java.lang.String = null
  ): PublicKeySummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime, EncodedKey = EncodedKey, Id = Id, Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[PublicKeySummary]
  }
}

