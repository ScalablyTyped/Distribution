package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies information about a single property failed to be set.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
@js.native
trait SetPropertyTolerantFailed extends js.Object {
  
  /** specifies the name of the property. */
  var Name: String = js.native
  
  /**
    * specifies the success or error code for setting the properties value.
    *
    * Since the property was not successful set the result will never be {@link com.sun.star.beans.TolerantPropertySetResultType.SUCCESS} .
    * @see com.sun.star.beans.TolerantPropertySetResultType
    */
  var Result: Double = js.native
}
object SetPropertyTolerantFailed {
  
  @scala.inline
  def apply(Name: String, Result: Double): SetPropertyTolerantFailed = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPropertyTolerantFailed]
  }
  
  @scala.inline
  implicit class SetPropertyTolerantFailedOps[Self <: SetPropertyTolerantFailed] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Double): Self = this.set("Result", value.asInstanceOf[js.Any])
  }
}
