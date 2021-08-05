package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXLocator interface */
trait IVBSAXLocator extends StObject {
  
  /* private */ @JSName("MSXML2.IVBSAXLocator_typekey")
  var MSXML2DotIVBSAXLocator_typekey: IVBSAXLocator
  
  /** Get the column number where the current document event ends. */
  val columnNumber: Double
  
  /** Get the line number where the current document event ends. */
  val lineNumber: Double
  
  /** Get the public identifier for the current document event. */
  val publicId: String
  
  /** Get the system identifier for the current document event. */
  val systemId: String
}
object IVBSAXLocator {
  
  inline def apply(
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
  
  extension [Self <: IVBSAXLocator](x: Self) {
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setMSXML2DotIVBSAXLocator_typekey(value: IVBSAXLocator): Self = StObject.set(x, "MSXML2.IVBSAXLocator_typekey", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
  }
}
