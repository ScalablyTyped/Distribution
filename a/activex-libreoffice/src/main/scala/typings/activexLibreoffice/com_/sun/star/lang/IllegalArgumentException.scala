package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception is thrown to indicate that a method has passed an illegal or inappropriate argument. */
trait IllegalArgumentException extends Exception {
  /**
    * identifies the position of the illegal argument.
    *
    * This field is -1 if the position is not known.
    */
  var ArgumentPosition: Double
}

object IllegalArgumentException {
  @scala.inline
  def apply(ArgumentPosition: Double, Context: XInterface, Message: String): IllegalArgumentException = {
    val __obj = js.Dynamic.literal(ArgumentPosition = ArgumentPosition.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IllegalArgumentException]
  }
}

