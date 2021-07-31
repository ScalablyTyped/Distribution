package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXEntityResolver interface */
trait IVBSAXEntityResolver extends StObject {
  
  @JSName("MSXML2.IVBSAXEntityResolver_typekey")
  var MSXML2DotIVBSAXEntityResolver_typekey: IVBSAXEntityResolver
  
  /** Allow the application to resolve external entities. */
  def resolveEntity(strPublicId: String, strSystemId: String): js.Any
}
object IVBSAXEntityResolver {
  
  @scala.inline
  def apply(
    MSXML2DotIVBSAXEntityResolver_typekey: IVBSAXEntityResolver,
    resolveEntity: (String, String) => js.Any
  ): IVBSAXEntityResolver = {
    val __obj = js.Dynamic.literal(resolveEntity = js.Any.fromFunction2(resolveEntity))
    __obj.updateDynamic("MSXML2.IVBSAXEntityResolver_typekey")(MSXML2DotIVBSAXEntityResolver_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXEntityResolver]
  }
  
  @scala.inline
  implicit class IVBSAXEntityResolverMutableBuilder[Self <: IVBSAXEntityResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSXML2DotIVBSAXEntityResolver_typekey(value: IVBSAXEntityResolver): Self = StObject.set(x, "MSXML2.IVBSAXEntityResolver_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveEntity(value: (String, String) => js.Any): Self = StObject.set(x, "resolveEntity", js.Any.fromFunction2(value))
  }
}
