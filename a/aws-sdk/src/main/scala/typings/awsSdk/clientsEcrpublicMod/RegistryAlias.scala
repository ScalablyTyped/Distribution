package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryAlias extends StObject {
  
  /**
    * Whether or not the registry alias is the default alias for the registry. When the first public repository is created, your public registry is assigned a default registry alias.
    */
  var defaultRegistryAlias: DefaultRegistryAliasFlag
  
  /**
    * The name of the registry alias.
    */
  var name: RegistryAliasName
  
  /**
    * Whether or not the registry alias is the primary alias for the registry. If true, the alias is the primary registry alias and is displayed in both the repository URL and the image URI used in the docker pull commands on the Amazon ECR Public Gallery.  A registry alias that is not the primary registry alias can be used in the repository URI in a docker pull command. 
    */
  var primaryRegistryAlias: PrimaryRegistryAliasFlag
  
  /**
    * The status of the registry alias.
    */
  var status: RegistryAliasStatus
}
object RegistryAlias {
  
  inline def apply(
    defaultRegistryAlias: DefaultRegistryAliasFlag,
    name: RegistryAliasName,
    primaryRegistryAlias: PrimaryRegistryAliasFlag,
    status: RegistryAliasStatus
  ): RegistryAlias = {
    val __obj = js.Dynamic.literal(defaultRegistryAlias = defaultRegistryAlias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryRegistryAlias = primaryRegistryAlias.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryAlias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistryAlias] (val x: Self) extends AnyVal {
    
    inline def setDefaultRegistryAlias(value: DefaultRegistryAliasFlag): Self = StObject.set(x, "defaultRegistryAlias", value.asInstanceOf[js.Any])
    
    inline def setName(value: RegistryAliasName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrimaryRegistryAlias(value: PrimaryRegistryAliasFlag): Self = StObject.set(x, "primaryRegistryAlias", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RegistryAliasStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
