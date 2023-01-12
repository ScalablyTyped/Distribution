package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/commands/update/cli.UpdateCommandArgs> */
trait OptionsUpdateCommandArgs extends StObject {
  
  var `allow-dirty`: Boolean
  
  var `create-commits`: Boolean
  
  var force: Boolean
  
  var from: js.UndefOr[String] = js.undefined
  
  var `migrate-only`: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var next: Boolean
  
  var packages: js.UndefOr[js.Array[String]] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var verbose: Boolean
}
object OptionsUpdateCommandArgs {
  
  inline def apply(`allow-dirty`: Boolean, `create-commits`: Boolean, force: Boolean, next: Boolean, verbose: Boolean): OptionsUpdateCommandArgs = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("allow-dirty")(`allow-dirty`.asInstanceOf[js.Any])
    __obj.updateDynamic("create-commits")(`create-commits`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsUpdateCommandArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsUpdateCommandArgs] (val x: Self) extends AnyVal {
    
    inline def `setAllow-dirty`(value: Boolean): Self = StObject.set(x, "allow-dirty", value.asInstanceOf[js.Any])
    
    inline def `setCreate-commits`(value: Boolean): Self = StObject.set(x, "create-commits", value.asInstanceOf[js.Any])
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def `setMigrate-only`(value: Boolean): Self = StObject.set(x, "migrate-only", value.asInstanceOf[js.Any])
    
    inline def `setMigrate-onlyUndefined`: Self = StObject.set(x, "migrate-only", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
