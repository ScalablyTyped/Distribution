package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables creation of redlines (change tracking). */
@js.native
trait XRedline extends js.Object {
  
  /**
    * @param RedlineType  Valid type names are:    Insert - marks an insertion    Delete - marks an deletion    Format - marks an attribute change    {@link T
    * @param RedlineProperties contains the following parameters [readonly, property] string RedlineAuthor; [readonly, property] {@link com.sun.star.util.Date
    */
  def makeRedline(RedlineType: String, RedlineProperties: PropertyValues): Unit = js.native
}
object XRedline {
  
  @scala.inline
  def apply(makeRedline: (String, PropertyValues) => Unit): XRedline = {
    val __obj = js.Dynamic.literal(makeRedline = js.Any.fromFunction2(makeRedline))
    __obj.asInstanceOf[XRedline]
  }
  
  @scala.inline
  implicit class XRedlineOps[Self <: XRedline] (val x: Self) extends AnyVal {
    
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
    def setMakeRedline(value: (String, PropertyValues) => Unit): Self = this.set("makeRedline", js.Any.fromFunction2(value))
  }
}
