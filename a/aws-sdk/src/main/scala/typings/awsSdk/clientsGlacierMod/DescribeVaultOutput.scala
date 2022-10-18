package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVaultOutput extends StObject {
  
  /**
    * The Universal Coordinated Time (UTC) date when the vault was created. This value should be a string in the ISO 8601 date format, for example 2012-03-20T17:03:43.221Z.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The Universal Coordinated Time (UTC) date when Amazon S3 Glacier completed the last vault inventory. This value should be a string in the ISO 8601 date format, for example 2012-03-20T17:03:43.221Z.
    */
  var LastInventoryDate: js.UndefOr[String] = js.undefined
  
  /**
    * The number of archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.
    */
  var NumberOfArchives: js.UndefOr[long] = js.undefined
  
  /**
    * Total size, in bytes, of the archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.
    */
  var SizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the vault.
    */
  var VaultARN: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the vault.
    */
  var VaultName: js.UndefOr[String] = js.undefined
}
object DescribeVaultOutput {
  
  inline def apply(): DescribeVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVaultOutput]
  }
  
  extension [Self <: DescribeVaultOutput](x: Self) {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setLastInventoryDate(value: String): Self = StObject.set(x, "LastInventoryDate", value.asInstanceOf[js.Any])
    
    inline def setLastInventoryDateUndefined: Self = StObject.set(x, "LastInventoryDate", js.undefined)
    
    inline def setNumberOfArchives(value: long): Self = StObject.set(x, "NumberOfArchives", value.asInstanceOf[js.Any])
    
    inline def setNumberOfArchivesUndefined: Self = StObject.set(x, "NumberOfArchives", js.undefined)
    
    inline def setSizeInBytes(value: long): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "SizeInBytes", js.undefined)
    
    inline def setVaultARN(value: String): Self = StObject.set(x, "VaultARN", value.asInstanceOf[js.Any])
    
    inline def setVaultARNUndefined: Self = StObject.set(x, "VaultARN", js.undefined)
    
    inline def setVaultName(value: String): Self = StObject.set(x, "VaultName", value.asInstanceOf[js.Any])
    
    inline def setVaultNameUndefined: Self = StObject.set(x, "VaultName", js.undefined)
  }
}
