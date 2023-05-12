package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInput extends StObject {
  
  /**
    * The name of the app.
    */
  var App: SimSpaceWeaverLongResourceName
  
  /**
    * The name of the domain of the app.
    */
  var Domain: SimSpaceWeaverResourceName
  
  /**
    * The name of the simulation of the app.
    */
  var Simulation: SimSpaceWeaverResourceName
}
object DescribeAppInput {
  
  inline def apply(
    App: SimSpaceWeaverLongResourceName,
    Domain: SimSpaceWeaverResourceName,
    Simulation: SimSpaceWeaverResourceName
  ): DescribeAppInput = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], Simulation = Simulation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppInput] (val x: Self) extends AnyVal {
    
    inline def setApp(value: SimSpaceWeaverLongResourceName): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
  }
}
