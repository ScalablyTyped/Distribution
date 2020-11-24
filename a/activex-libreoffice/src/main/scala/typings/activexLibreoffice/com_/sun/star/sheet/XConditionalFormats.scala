package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XConditionalFormats extends XInterface {
  
  val ConditionalFormats: SafeArray[XConditionalFormat] = js.native
  
  val Length: Double = js.native
  
  /** adds a conditional format to the existing list returns the id of the inserted conditional format */
  def createByRange(range: XSheetCellRanges): Double = js.native
  
  def getConditionalFormats(): SafeArray[XConditionalFormat] = js.native
  
  def getLength(): Double = js.native
  
  def removeByID(ID: Double): Unit = js.native
}
object XConditionalFormats {
  
  @scala.inline
  def apply(
    ConditionalFormats: SafeArray[XConditionalFormat],
    Length: Double,
    acquire: () => Unit,
    createByRange: XSheetCellRanges => Double,
    getConditionalFormats: () => SafeArray[XConditionalFormat],
    getLength: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByID: Double => Unit
  ): XConditionalFormats = {
    val __obj = js.Dynamic.literal(ConditionalFormats = ConditionalFormats.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createByRange = js.Any.fromFunction1(createByRange), getConditionalFormats = js.Any.fromFunction0(getConditionalFormats), getLength = js.Any.fromFunction0(getLength), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByID = js.Any.fromFunction1(removeByID))
    __obj.asInstanceOf[XConditionalFormats]
  }
  
  @scala.inline
  implicit class XConditionalFormatsOps[Self <: XConditionalFormats] (val x: Self) extends AnyVal {
    
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
    def setConditionalFormats(value: SafeArray[XConditionalFormat]): Self = this.set("ConditionalFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateByRange(value: XSheetCellRanges => Double): Self = this.set("createByRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConditionalFormats(value: () => SafeArray[XConditionalFormat]): Self = this.set("getConditionalFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveByID(value: Double => Unit): Self = this.set("removeByID", js.Any.fromFunction1(value))
  }
}
