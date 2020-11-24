package typings.appBuilderLib.frameworkMod

import typings.appBuilderLib.configurationMod.AfterPackContext
import typings.appBuilderLib.mod.Platform
import typings.builderUtil.fsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Framework extends js.Object {
  
  var afterPack: js.UndefOr[js.Function1[/* context */ AfterPackContext, js.Promise[_]]] = js.native
  
  var beforeCopyExtraFiles: js.UndefOr[js.Function1[/* options */ BeforeCopyExtraFilesOptions, js.Promise[_]]] = js.native
  
  var createTransformer: js.UndefOr[js.Function0[FileTransformer | Null]] = js.native
  
  val defaultAppIdPrefix: String = js.native
  
  val distMacOsAppName: String = js.native
  
  var getDefaultIcon: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.native
  
  var getExcludedDependencies: js.UndefOr[js.Function1[/* platform */ Platform, js.Array[String] | Null]] = js.native
  
  var getMainFile: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.native
  
  val isCopyElevateHelper: Boolean = js.native
  
  val isNpmRebuildRequired: Boolean = js.native
  
  val macOsDefaultTargets: js.Array[String] = js.native
  
  val name: String = js.native
  
  def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[_] = js.native
  
  val version: String = js.native
}
object Framework {
  
  @scala.inline
  def apply(
    defaultAppIdPrefix: String,
    distMacOsAppName: String,
    isCopyElevateHelper: Boolean,
    isNpmRebuildRequired: Boolean,
    macOsDefaultTargets: js.Array[String],
    name: String,
    prepareApplicationStageDirectory: PrepareApplicationStageDirectoryOptions => js.Promise[_],
    version: String
  ): Framework = {
    val __obj = js.Dynamic.literal(defaultAppIdPrefix = defaultAppIdPrefix.asInstanceOf[js.Any], distMacOsAppName = distMacOsAppName.asInstanceOf[js.Any], isCopyElevateHelper = isCopyElevateHelper.asInstanceOf[js.Any], isNpmRebuildRequired = isNpmRebuildRequired.asInstanceOf[js.Any], macOsDefaultTargets = macOsDefaultTargets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prepareApplicationStageDirectory = js.Any.fromFunction1(prepareApplicationStageDirectory), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Framework]
  }
  
  @scala.inline
  implicit class FrameworkOps[Self <: Framework] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultAppIdPrefix(value: String): Self = this.set("defaultAppIdPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistMacOsAppName(value: String): Self = this.set("distMacOsAppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCopyElevateHelper(value: Boolean): Self = this.set("isCopyElevateHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNpmRebuildRequired(value: Boolean): Self = this.set("isNpmRebuildRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacOsDefaultTargetsVarargs(value: String*): Self = this.set("macOsDefaultTargets", js.Array(value :_*))
    
    @scala.inline
    def setMacOsDefaultTargets(value: js.Array[String]): Self = this.set("macOsDefaultTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepareApplicationStageDirectory(value: PrepareApplicationStageDirectoryOptions => js.Promise[_]): Self = this.set("prepareApplicationStageDirectory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterPack(value: /* context */ AfterPackContext => js.Promise[_]): Self = this.set("afterPack", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterPack: Self = this.set("afterPack", js.undefined)
    
    @scala.inline
    def setBeforeCopyExtraFiles(value: /* options */ BeforeCopyExtraFilesOptions => js.Promise[_]): Self = this.set("beforeCopyExtraFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeCopyExtraFiles: Self = this.set("beforeCopyExtraFiles", js.undefined)
    
    @scala.inline
    def setCreateTransformer(value: () => FileTransformer | Null): Self = this.set("createTransformer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreateTransformer: Self = this.set("createTransformer", js.undefined)
    
    @scala.inline
    def setGetDefaultIcon(value: /* platform */ Platform => String | Null): Self = this.set("getDefaultIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDefaultIcon: Self = this.set("getDefaultIcon", js.undefined)
    
    @scala.inline
    def setGetExcludedDependencies(value: /* platform */ Platform => js.Array[String] | Null): Self = this.set("getExcludedDependencies", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetExcludedDependencies: Self = this.set("getExcludedDependencies", js.undefined)
    
    @scala.inline
    def setGetMainFile(value: /* platform */ Platform => String | Null): Self = this.set("getMainFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetMainFile: Self = this.set("getMainFile", js.undefined)
  }
}
