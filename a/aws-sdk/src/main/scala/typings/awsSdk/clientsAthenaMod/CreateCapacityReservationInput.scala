package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCapacityReservationInput extends StObject {
  
  /**
    * The name of the capacity reservation to create.
    */
  var Name: CapacityReservationName
  
  /**
    * The tags for the capacity reservation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The number of requested data processing units.
    */
  var TargetDpus: TargetDpusInteger
}
object CreateCapacityReservationInput {
  
  inline def apply(Name: CapacityReservationName, TargetDpus: TargetDpusInteger): CreateCapacityReservationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TargetDpus = TargetDpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCapacityReservationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCapacityReservationInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: CapacityReservationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetDpus(value: TargetDpusInteger): Self = StObject.set(x, "TargetDpus", value.asInstanceOf[js.Any])
  }
}
