package typings.angularCli

import typings.angularCli.anon.Save
import typings.angularCli.anon.`0`
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesPackageTreeMod {
  
  @JSImport("@angular/cli/src/utilities/package-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findPackageJson(workspaceDir: String, packageName: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPackageJson")(workspaceDir.asInstanceOf[js.Any], packageName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getProjectDependencies(dir: String): js.Promise[Map[String, PackageTreeNode]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectDependencies")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, PackageTreeNode]]]
  
  inline def readPackageJson(packageJsonPath: String): js.Promise[js.UndefOr[PackageJson]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageJson")(packageJsonPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[PackageJson]]]
  
  trait PackageJson extends StObject {
    
    var dependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: String
    
    var `ng-add`: js.UndefOr[Save] = js.undefined
    
    var `ng-update`: js.UndefOr[`0`] = js.undefined
    
    var optionalDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var version: String
  }
  object PackageJson {
    
    inline def apply(name: String, version: String): PackageJson = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageJson]
    }
    
    extension [Self <: PackageJson](x: Self) {
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def `setNg-add`(value: Save): Self = StObject.set(x, "ng-add", value.asInstanceOf[js.Any])
      
      inline def `setNg-addUndefined`: Self = StObject.set(x, "ng-add", js.undefined)
      
      inline def `setNg-update`(value: `0`): Self = StObject.set(x, "ng-update", value.asInstanceOf[js.Any])
      
      inline def `setNg-updateUndefined`: Self = StObject.set(x, "ng-update", js.undefined)
      
      inline def setOptionalDependencies(value: Record[String, String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setPeerDependencies(value: Record[String, String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackageTreeNode extends StObject {
    
    @JSName("package")
    var _package: js.UndefOr[PackageJson] = js.undefined
    
    var name: String
    
    var path: String
    
    var version: String
  }
  object PackageTreeNode {
    
    inline def apply(name: String, path: String, version: String): PackageTreeNode = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageTreeNode]
    }
    
    extension [Self <: PackageTreeNode](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def set_package(value: PackageJson): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
}
