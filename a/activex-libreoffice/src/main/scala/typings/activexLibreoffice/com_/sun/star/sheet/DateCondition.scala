package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateCondition extends XConditionEntry {
  
  /** See {@link com.sun.star.sheet.DateType} for possible values */
  var DateType: Double = js.native
  
  var StyleName: String = js.native
}
object DateCondition {
  
  @scala.inline
  def apply(
    DateType: Double,
    StyleName: String,
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DateCondition = {
    val __obj = js.Dynamic.literal(DateType = DateType.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DateCondition]
  }
  
  @scala.inline
  implicit class DateConditionOps[Self <: DateCondition] (val x: Self) extends AnyVal {
    
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
    def setDateType(value: Double): Self = this.set("DateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleName(value: String): Self = this.set("StyleName", value.asInstanceOf[js.Any])
  }
}
