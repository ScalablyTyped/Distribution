package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a template for a style (aka style sheet). */
@js.native
trait XStyle extends XNamed {
  
  /** @returns the name of the parent style, probably empty. */
  var ParentStyle: String = js.native
  
  /** @returns the name of the parent style, probably empty. */
  def getParentStyle(): String = js.native
  
  /** @returns `TRUE` if this type is used in the document. */
  def isInUse(): Boolean = js.native
  
  /** identifies a style as defined by the user. */
  def isUserDefined(): Boolean = js.native
  
  /** sets the name of the parent style. */
  def setParentStyle(aParentStyle: String): Unit = js.native
}
object XStyle {
  
  @scala.inline
  def apply(
    Name: String,
    ParentStyle: String,
    acquire: () => Unit,
    getName: () => String,
    getParentStyle: () => String,
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit
  ): XStyle = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle))
    __obj.asInstanceOf[XStyle]
  }
  
  @scala.inline
  implicit class XStyleOps[Self <: XStyle] (val x: Self) extends AnyVal {
    
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
    def setParentStyle(value: String): Self = this.set("ParentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetParentStyle(value: () => String): Self = this.set("getParentStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInUse(value: () => Boolean): Self = this.set("isInUse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUserDefined(value: () => Boolean): Self = this.set("isUserDefined", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetParentStyle(value: String => Unit): Self = this.set("setParentStyle", js.Any.fromFunction1(value))
  }
}
