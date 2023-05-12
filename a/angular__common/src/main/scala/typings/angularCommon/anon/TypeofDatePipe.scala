package typings.angularCommon.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.date
import typings.angularCommon.mod.DatePipe
import typings.angularCommon.mod.DatePipeConfig
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDatePipe
  extends StObject
     with Instantiable1[/* locale */ String, DatePipe]
     with Instantiable2[/* locale */ String, /* defaultTimezone */ String, DatePipe]
     with Instantiable3[
      /* locale */ String, 
      (/* defaultTimezone */ Null) | (/* defaultTimezone */ String) | (/* defaultTimezone */ Unit), 
      /* defaultOptions */ DatePipeConfig, 
      DatePipe
    ] {
  
  var ɵfac: ɵɵFactoryDeclaration[DatePipe, js.Tuple3[Null, Optional, Optional]] = js.native
  
  var ɵpipe: ɵɵPipeDeclaration[DatePipe, date, `true`] = js.native
}
