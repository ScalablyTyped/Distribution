package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.sdbc.SQLException
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides special information about the context where a {@link com.sun.star.sdbc.SQLException} occurred. As usual for SQLExceptions, several
  * SQLContext-objects may be chained, then the most recent context is appended to the list's tail.
  * @see com.sun.star.sdbc.XConnection.getWarnings
  * @see com.sun.star.sdbc.XResultSet.getWarnings
  * @see com.sun.star.sdbc.XStatement.getWarnings
  */
@js.native
trait SQLContext extends SQLException {
  /**
    * provides special info about the details where a {@link com.sun.star.sdbc.SQLException} occurred. As usual for SQLExceptions, several
    * SQLContext-objects may be chained, then the most recent context is appended to the list's tail
    */
  var Details: String = js.native
}

object SQLContext {
  @scala.inline
  def apply(
    Context: XInterface,
    Details: String,
    ErrorCode: Double,
    Message: String,
    NextException: js.Any,
    SQLState: String
  ): SQLContext = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextException = NextException.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLContext]
  }
  @scala.inline
  implicit class SQLContextOps[Self <: SQLContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetails(value: String): Self = this.set("Details", value.asInstanceOf[js.Any])
  }
  
}

