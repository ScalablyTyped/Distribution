package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconSet extends XConditionEntry {
  
  var IconSetEntries: SafeArray[XIconSetEntry] = js.native
  
  /** See {@link com.sun.star.sheet.IconSetType} for possible values. */
  var Icons: Double = js.native
  
  var Reverse: Boolean = js.native
  
  var ShowValue: Boolean = js.native
}
object IconSet {
  
  @scala.inline
  def apply(
    IconSetEntries: SafeArray[XIconSetEntry],
    Icons: Double,
    Reverse: Boolean,
    ShowValue: Boolean,
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): IconSet = {
    val __obj = js.Dynamic.literal(IconSetEntries = IconSetEntries.asInstanceOf[js.Any], Icons = Icons.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], ShowValue = ShowValue.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[IconSet]
  }
  
  @scala.inline
  implicit class IconSetOps[Self <: IconSet] (val x: Self) extends AnyVal {
    
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
    def setIconSetEntries(value: SafeArray[XIconSetEntry]): Self = this.set("IconSetEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons(value: Double): Self = this.set("Icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("Reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("ShowValue", value.asInstanceOf[js.Any])
  }
}
