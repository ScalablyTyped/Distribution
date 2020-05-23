package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  @JSName("DAO.Error_typekey")
  var DAODotError_typekey: Error
  val Description: String
  val HelpContext: Double
  val HelpFile: String
  val Number: Double
  val Source: String
}

object Error {
  @scala.inline
  def apply(
    DAODotError_typekey: Error,
    Description: String,
    HelpContext: Double,
    HelpFile: String,
    Number: Double,
    Source: String
  ): Error = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Error_typekey")(DAODotError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

