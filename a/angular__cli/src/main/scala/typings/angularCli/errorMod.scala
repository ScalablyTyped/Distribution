package typings.angularCli

import typings.angularCli.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@angular/cli/src/utilities/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertIsError(value: Any): (/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Error))),IArray())*/ Boolean) & Code = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsError")(value.asInstanceOf[js.Any]).asInstanceOf[(/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Error))),IArray())*/ Boolean) & Code]
}
