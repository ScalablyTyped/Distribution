package typings.arconnect

import typings.arconnect.anon.Address
import typings.arconnect.anon.Connect
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.arconnect.arconnectStrings.ACCESS_ADDRESS
    - typings.arconnect.arconnectStrings.ACCESS_ALL_ADDRESSES
    - typings.arconnect.arconnectStrings.SIGN_TRANSACTION
    - typings.arconnect.arconnectStrings.ENCRYPT
    - typings.arconnect.arconnectStrings.DECRYPT
  */
  trait PermissionType extends StObject
  object PermissionType {
    
    inline def ACCESS_ADDRESS: typings.arconnect.arconnectStrings.ACCESS_ADDRESS = "ACCESS_ADDRESS".asInstanceOf[typings.arconnect.arconnectStrings.ACCESS_ADDRESS]
    
    inline def ACCESS_ALL_ADDRESSES: typings.arconnect.arconnectStrings.ACCESS_ALL_ADDRESSES = "ACCESS_ALL_ADDRESSES".asInstanceOf[typings.arconnect.arconnectStrings.ACCESS_ALL_ADDRESSES]
    
    inline def DECRYPT: typings.arconnect.arconnectStrings.DECRYPT = "DECRYPT".asInstanceOf[typings.arconnect.arconnectStrings.DECRYPT]
    
    inline def ENCRYPT: typings.arconnect.arconnectStrings.ENCRYPT = "ENCRYPT".asInstanceOf[typings.arconnect.arconnectStrings.ENCRYPT]
    
    inline def SIGN_TRANSACTION: typings.arconnect.arconnectStrings.SIGN_TRANSACTION = "SIGN_TRANSACTION".asInstanceOf[typings.arconnect.arconnectStrings.SIGN_TRANSACTION]
  }
  
  /**
    * Arweave wallet declarations
    */
  object global {
    
    trait Window extends StObject {
      
      var arweaveWallet: Connect
    }
    object Window {
      
      inline def apply(arweaveWallet: Connect): Window = {
        val __obj = js.Dynamic.literal(arweaveWallet = arweaveWallet.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setArweaveWallet(value: Connect): Self = StObject.set(x, "arweaveWallet", value.asInstanceOf[js.Any])
      }
    }
    
    trait WindowEventMap extends StObject {
      
      var arweaveWalletLoaded: CustomEvent[js.Object]
      
      var walletSwitch: CustomEvent[Address]
    }
    object WindowEventMap {
      
      inline def apply(arweaveWalletLoaded: CustomEvent[js.Object], walletSwitch: CustomEvent[Address]): WindowEventMap = {
        val __obj = js.Dynamic.literal(arweaveWalletLoaded = arweaveWalletLoaded.asInstanceOf[js.Any], walletSwitch = walletSwitch.asInstanceOf[js.Any])
        __obj.asInstanceOf[WindowEventMap]
      }
      
      extension [Self <: WindowEventMap](x: Self) {
        
        inline def setArweaveWalletLoaded(value: CustomEvent[js.Object]): Self = StObject.set(x, "arweaveWalletLoaded", value.asInstanceOf[js.Any])
        
        inline def setWalletSwitch(value: CustomEvent[Address]): Self = StObject.set(x, "walletSwitch", value.asInstanceOf[js.Any])
      }
    }
  }
}
