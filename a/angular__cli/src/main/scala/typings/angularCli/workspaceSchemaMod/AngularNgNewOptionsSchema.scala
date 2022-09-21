package typings.angularCli.workspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularNgNewOptionsSchema extends StObject {
  
  /**
    * Initial git repository commit information.
    */
  var commit: js.UndefOr[CommitUnion] = js.undefined
  
  /**
    * Create a new initial application project in the 'src' folder of the new workspace. When
    * false, creates an empty workspace with no initial application. You can then use the
    * generate application command so that all applications are created in the projects folder.
    */
  var createApplication: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The directory name to create the workspace in.
    */
  var directory: js.UndefOr[String] = js.undefined
  
  /**
    * Include styles inline in the component TS file. By default, an external styles file is
    * created and referenced in the component TypeScript file.
    */
  var inlineStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include template inline in the component TS file. By default, an external template file
    * is created and referenced in the component TypeScript file.
    */
  var inlineTemplate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Link the CLI to the global version (internal development only).
    */
  var linkCli: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Create a workspace without any testing frameworks. (Use for learning purposes only.)
    */
  var minimal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the new workspace and initial project.
    */
  var name: String
  
  /**
    * The path where new projects will be created, relative to the new workspace root.
    */
  var newProjectRoot: js.UndefOr[String] = js.undefined
  
  /**
    * The package manager used to install dependencies.
    */
  var packageManager: js.UndefOr[PackageManager] = js.undefined
  
  /**
    * The prefix to apply to generated selectors for the initial project.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Generate a routing module for the initial project.
    */
  var routing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not initialize a git repository.
    */
  var skipGit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not install dependency packages.
    */
  var skipInstall: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not generate "spec.ts" test files for the new project.
    */
  var skipTests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Creates a workspace with stricter type checking and stricter bundle budgets settings.
    * This setting helps improve maintainability and catch bugs ahead of time. For more
    * information, see https://angular.io/guide/strict-mode
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file extension or preprocessor to use for style files.
    */
  var style: js.UndefOr[SchematicsAngularApplicationStyle] = js.undefined
  
  /**
    * The version of the Angular CLI to use.
    */
  var version: String
  
  /**
    * The view encapsulation strategy to use in the initial project.
    */
  var viewEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
}
object AngularNgNewOptionsSchema {
  
  inline def apply(name: String, version: String): AngularNgNewOptionsSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularNgNewOptionsSchema]
  }
  
  extension [Self <: AngularNgNewOptionsSchema](x: Self) {
    
    inline def setCommit(value: CommitUnion): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    inline def setCreateApplication(value: Boolean): Self = StObject.set(x, "createApplication", value.asInstanceOf[js.Any])
    
    inline def setCreateApplicationUndefined: Self = StObject.set(x, "createApplication", js.undefined)
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setInlineStyle(value: Boolean): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
    
    inline def setInlineStyleUndefined: Self = StObject.set(x, "inlineStyle", js.undefined)
    
    inline def setInlineTemplate(value: Boolean): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
    
    inline def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
    
    inline def setLinkCli(value: Boolean): Self = StObject.set(x, "linkCli", value.asInstanceOf[js.Any])
    
    inline def setLinkCliUndefined: Self = StObject.set(x, "linkCli", js.undefined)
    
    inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
    
    inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewProjectRoot(value: String): Self = StObject.set(x, "newProjectRoot", value.asInstanceOf[js.Any])
    
    inline def setNewProjectRootUndefined: Self = StObject.set(x, "newProjectRoot", js.undefined)
    
    inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRouting(value: Boolean): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setSkipGit(value: Boolean): Self = StObject.set(x, "skipGit", value.asInstanceOf[js.Any])
    
    inline def setSkipGitUndefined: Self = StObject.set(x, "skipGit", js.undefined)
    
    inline def setSkipInstall(value: Boolean): Self = StObject.set(x, "skipInstall", value.asInstanceOf[js.Any])
    
    inline def setSkipInstallUndefined: Self = StObject.set(x, "skipInstall", js.undefined)
    
    inline def setSkipTests(value: Boolean): Self = StObject.set(x, "skipTests", value.asInstanceOf[js.Any])
    
    inline def setSkipTestsUndefined: Self = StObject.set(x, "skipTests", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setStyle(value: SchematicsAngularApplicationStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setViewEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "viewEncapsulation", value.asInstanceOf[js.Any])
    
    inline def setViewEncapsulationUndefined: Self = StObject.set(x, "viewEncapsulation", js.undefined)
  }
}
