package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotInput extends StObject {
  
  /**
    * The Amazon S3 bucket and optional folder (object key prefix) where SimSpace Weaver creates the snapshot file.
    */
  var Destination: S3Destination
  
  /**
    * The name of the simulation.
    */
  var Simulation: SimSpaceWeaverResourceName
}
object CreateSnapshotInput {
  
  inline def apply(Destination: S3Destination, Simulation: SimSpaceWeaverResourceName): CreateSnapshotInput = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Simulation = Simulation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSnapshotInput] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: S3Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
  }
}
