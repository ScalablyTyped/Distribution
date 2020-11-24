package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IVBSAXEntityResolver interface */
@js.native
trait IVBSAXEntityResolver extends js.Object {
  
  @JSName("MSXML2.IVBSAXEntityResolver_typekey")
  var MSXML2DotIVBSAXEntityResolver_typekey: IVBSAXEntityResolver = js.native
  
  /** Allow the application to resolve external entities. */
  def resolveEntity(strPublicId: String, strSystemId: String): js.Any = js.native
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
  implicit class IVBSAXEntityResolverOps[Self <: IVBSAXEntityResolver] (val x: Self) extends AnyVal {
    
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
    def setMSXML2DotIVBSAXEntityResolver_typekey(value: IVBSAXEntityResolver): Self = this.set("MSXML2.IVBSAXEntityResolver_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveEntity(value: (String, String) => js.Any): Self = this.set("resolveEntity", js.Any.fromFunction2(value))
  }
}
