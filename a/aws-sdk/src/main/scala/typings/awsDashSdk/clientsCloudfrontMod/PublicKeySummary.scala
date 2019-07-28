package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeySummary extends js.Object {
  /**
    *  Comment for public key information summary. 
    */
  var Comment: js.UndefOr[String] = js.undefined
  /**
    *  Creation time for public key information summary. 
    */
  var CreatedTime: timestamp
  /**
    *  Encoded key for public key information summary. 
    */
  var EncodedKey: String
  /**
    *  ID for public key information summary. 
    */
  var Id: String
  /**
    *  Name for public key information summary. 
    */
  var Name: String
}

object PublicKeySummary {
  @scala.inline
  def apply(CreatedTime: timestamp, EncodedKey: String, Id: String, Name: String, Comment: String = null): PublicKeySummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime, EncodedKey = EncodedKey, Id = Id, Name = Name)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[PublicKeySummary]
  }
}

