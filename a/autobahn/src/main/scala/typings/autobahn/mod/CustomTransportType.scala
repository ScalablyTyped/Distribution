package typings.autobahn.mod

import typings.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Workaround to get intellisense on type unions of 'literals' | string. 
// See https://github.com/Microsoft/TypeScript/issues/29729
@js.native
trait CustomTransportType
  extends StObject
     with String
     with TransportType {
  
  var zz_IGNORE_ME: js.UndefOr[scala.Nothing] = js.native
}
