package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXEntityResolver interface */
trait IVBSAXEntityResolver extends js.Object {
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
}

