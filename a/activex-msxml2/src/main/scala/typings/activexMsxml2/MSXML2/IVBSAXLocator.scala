package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXLocator interface */
@js.native
trait IVBSAXLocator extends StObject {
  
  @JSName("MSXML2.IVBSAXLocator_typekey")
  var MSXML2DotIVBSAXLocator_typekey: IVBSAXLocator = js.native
  
  /** Get the column number where the current document event ends. */
  val columnNumber: Double = js.native
  
  /** Get the line number where the current document event ends. */
  val lineNumber: Double = js.native
  
  /** Get the public identifier for the current document event. */
  val publicId: String = js.native
  
  /** Get the system identifier for the current document event. */
  val systemId: String = js.native
}
object IVBSAXLocator {
  
  @scala.inline
  def apply(
    MSXML2DotIVBSAXLocator_typekey: IVBSAXLocator,
    columnNumber: Double,
    lineNumber: Double,
    publicId: String,
    systemId: String
  ): IVBSAXLocator = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.IVBSAXLocator_typekey")(MSXML2DotIVBSAXLocator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXLocator]
  }
  
  @scala.inline
  implicit class IVBSAXLocatorMutableBuilder[Self <: IVBSAXLocator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSXML2DotIVBSAXLocator_typekey(value: IVBSAXLocator): Self = StObject.set(x, "MSXML2.IVBSAXLocator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
  }
}
