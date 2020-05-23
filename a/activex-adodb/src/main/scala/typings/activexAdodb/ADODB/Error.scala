package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  @JSName("ADODB.Error_typekey")
  var ADODBDotError_typekey: Error
  val Description: String
  val HelpContext: Double
  val HelpFile: String
  val NativeError: Double
  val Number: Double
  val SQLState: String
  val Source: String
}

object Error {
  @scala.inline
  def apply(
    ADODBDotError_typekey: Error,
    Description: String,
    HelpContext: Double,
    HelpFile: String,
    NativeError: Double,
    Number: Double,
    SQLState: String,
    Source: String
  ): Error = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], NativeError = NativeError.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Error_typekey")(ADODBDotError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

