package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is raised when the data of a component schema, layer or update is not well-formed, violates the schema or is otherwise invalid.
  * @since OOo 1.1.2
  */
@js.native
trait MalformedDataException extends Exception {
  
  /**
    * data that provides more detailed information about the reason and location of the error.
    *
    * Typically this member should contain an exception characterizing the error in detail.
    *
    * For example the following exceptions may be used: **com::sun::star::container::ElementExistException**: for duplicate nodes.;
    *
    * **com::sun::star::container::NoSuchElementException**: for nodes that are not in the schema.;
    *
    * **com::sun::star::beans::IllegalTypeException**: for properties having the wrong or an invalid type.;
    *
    * **com::sun::star::beans::PropertyExistException**: for duplicate properties.;
    *
    * **com::sun::star::beans::UnknownPropertyException**: for properties that are not in the schema.;
    *
    * **com::sun::star::lang::IllegalArgumentException**: for data values (names,attributes,etc.) that are invalid.;
    *
    * **com::sun::star::lang::IllegalAccessException**: for changes that violate access restrictions.;
    *
    * **com::sun::star::lang::NoSupportException**: for features that are not supported by the current implementation.
    *
    *
    *
    * If no more detail information is available, this may be left `VOID` .
    */
  var ErrorDetails: js.Any = js.native
}
object MalformedDataException {
  
  @scala.inline
  def apply(Context: XInterface, ErrorDetails: js.Any, Message: String): MalformedDataException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorDetails = ErrorDetails.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedDataException]
  }
  
  @scala.inline
  implicit class MalformedDataExceptionOps[Self <: MalformedDataException] (val x: Self) extends AnyVal {
    
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
    def setErrorDetails(value: js.Any): Self = this.set("ErrorDetails", value.asInstanceOf[js.Any])
  }
}
