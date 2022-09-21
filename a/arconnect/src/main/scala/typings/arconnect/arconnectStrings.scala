package typings.arconnect

import typings.arconnect.mod.PermissionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arconnectStrings {
  
  @js.native
  sealed trait ACCESS_ADDRESS
    extends StObject
       with PermissionType
  inline def ACCESS_ADDRESS: ACCESS_ADDRESS = "ACCESS_ADDRESS".asInstanceOf[ACCESS_ADDRESS]
  
  @js.native
  sealed trait ACCESS_ALL_ADDRESSES
    extends StObject
       with PermissionType
  inline def ACCESS_ALL_ADDRESSES: ACCESS_ALL_ADDRESSES = "ACCESS_ALL_ADDRESSES".asInstanceOf[ACCESS_ALL_ADDRESSES]
  
  @js.native
  sealed trait DECRYPT
    extends StObject
       with PermissionType
  inline def DECRYPT: DECRYPT = "DECRYPT".asInstanceOf[DECRYPT]
  
  @js.native
  sealed trait ENCRYPT
    extends StObject
       with PermissionType
  inline def ENCRYPT: ENCRYPT = "ENCRYPT".asInstanceOf[ENCRYPT]
  
  @js.native
  sealed trait SIGN_TRANSACTION
    extends StObject
       with PermissionType
  inline def SIGN_TRANSACTION: SIGN_TRANSACTION = "SIGN_TRANSACTION".asInstanceOf[SIGN_TRANSACTION]
}
