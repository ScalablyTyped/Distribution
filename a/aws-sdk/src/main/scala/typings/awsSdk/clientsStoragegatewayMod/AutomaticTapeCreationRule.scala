package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticTapeCreationRule extends StObject {
  
  /**
    * The minimum number of available virtual tapes that the gateway maintains at all times. If the number of tapes on the gateway goes below this value, the gateway creates as many new tapes as are needed to have MinimumNumTapes on the gateway. For more information about automatic tape creation, see Creating Tapes Automatically.
    */
  var MinimumNumTapes: typings.awsSdk.clientsStoragegatewayMod.MinimumNumTapes
  
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the Amazon S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
    */
  var PoolId: typings.awsSdk.clientsStoragegatewayMod.PoolId
  
  /**
    * A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the barcode unique.  The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z. 
    */
  var TapeBarcodePrefix: typings.awsSdk.clientsStoragegatewayMod.TapeBarcodePrefix
  
  /**
    * The size, in bytes, of the virtual tape capacity.
    */
  var TapeSizeInBytes: TapeSize
  
  /**
    * Set to true to indicate that tapes are to be archived as write-once-read-many (WORM). Set to false when WORM is not enabled for tapes.
    */
  var Worm: js.UndefOr[scala.Boolean] = js.undefined
}
object AutomaticTapeCreationRule {
  
  inline def apply(
    MinimumNumTapes: MinimumNumTapes,
    PoolId: PoolId,
    TapeBarcodePrefix: TapeBarcodePrefix,
    TapeSizeInBytes: TapeSize
  ): AutomaticTapeCreationRule = {
    val __obj = js.Dynamic.literal(MinimumNumTapes = MinimumNumTapes.asInstanceOf[js.Any], PoolId = PoolId.asInstanceOf[js.Any], TapeBarcodePrefix = TapeBarcodePrefix.asInstanceOf[js.Any], TapeSizeInBytes = TapeSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticTapeCreationRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutomaticTapeCreationRule] (val x: Self) extends AnyVal {
    
    inline def setMinimumNumTapes(value: MinimumNumTapes): Self = StObject.set(x, "MinimumNumTapes", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: PoolId): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setTapeBarcodePrefix(value: TapeBarcodePrefix): Self = StObject.set(x, "TapeBarcodePrefix", value.asInstanceOf[js.Any])
    
    inline def setTapeSizeInBytes(value: TapeSize): Self = StObject.set(x, "TapeSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setWorm(value: scala.Boolean): Self = StObject.set(x, "Worm", value.asInstanceOf[js.Any])
    
    inline def setWormUndefined: Self = StObject.set(x, "Worm", js.undefined)
  }
}
