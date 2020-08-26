package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an exception that provides information on a database access error.
  *
  * Each {@link com.sun.star.sdbc.SQLException} provides several kinds of information:
  *
  * a string describing the error. This is used as the {@link com.sun.star.uno.Exception} message.
  */
@js.native
trait SQLException extends Exception {
  /**
    * returns an integer error code that is specific to each vendor. Normally this will be the actual error code returned by the underlying database. A
    * chain to the next Exception. This can be used to provide additional error information.
    */
  var ErrorCode: Double = js.native
  /** returns a chain to the next Exception. This can be used to provide additional error information. */
  var NextException: js.Any = js.native
  /** returns a string, which uses the XOPEN SQLState conventions. The values of the SQLState string are described in the XOPEN SQL spec. */
  var SQLState: String = js.native
}

object SQLException {
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, Message: String, NextException: js.Any, SQLState: String): SQLException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextException = NextException.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLException]
  }
  @scala.inline
  implicit class SQLExceptionOps[Self <: SQLException] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextException(value: js.Any): Self = this.set("NextException", value.asInstanceOf[js.Any])
    @scala.inline
    def setSQLState(value: String): Self = this.set("SQLState", value.asInstanceOf[js.Any])
  }
  
}

