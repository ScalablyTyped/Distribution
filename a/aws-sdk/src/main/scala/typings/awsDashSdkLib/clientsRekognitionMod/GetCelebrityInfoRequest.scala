package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCelebrityInfoRequest extends js.Object {
  /**
    * The ID for the celebrity. You get the celebrity ID from a call to the RecognizeCelebrities operation, which recognizes celebrities in an image. 
    */
  var Id: RekognitionUniqueId
}

object GetCelebrityInfoRequest {
  @scala.inline
  def apply(Id: RekognitionUniqueId): GetCelebrityInfoRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetCelebrityInfoRequest]
  }
}

