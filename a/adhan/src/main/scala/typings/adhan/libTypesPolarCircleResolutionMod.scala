package typings.adhan

import typings.adhan.anon.AqrabBalad
import typings.adhan.anon.Coordinates
import typings.adhan.libTypesCoordinatesMod.default
import typings.adhan.libTypesTypeUtilsMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesPolarCircleResolutionMod {
  
  @JSImport("adhan/lib/types/PolarCircleResolution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PolarCircleResolution {
    
    @JSImport("adhan/lib/types/PolarCircleResolution", "PolarCircleResolution.AqrabBalad")
    @js.native
    val AqrabBalad: typings.adhan.adhanStrings.AqrabBalad = js.native
    
    @JSImport("adhan/lib/types/PolarCircleResolution", "PolarCircleResolution.AqrabYaum")
    @js.native
    val AqrabYaum: typings.adhan.adhanStrings.AqrabYaum = js.native
    
    @JSImport("adhan/lib/types/PolarCircleResolution", "PolarCircleResolution.Unresolved")
    @js.native
    val Unresolved: typings.adhan.adhanStrings.Unresolved = js.native
  }
  
  inline def polarCircleResolvedValues(resolver: ValueOf[AqrabBalad], date: js.Date, coordinates: default): Coordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("polarCircleResolvedValues")(resolver.asInstanceOf[js.Any], date.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[Coordinates]
}
