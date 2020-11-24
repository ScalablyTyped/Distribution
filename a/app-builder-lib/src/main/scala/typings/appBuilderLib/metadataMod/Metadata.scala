package typings.appBuilderLib.metadataMod

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.configurationMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends js.Object {
  
  val author: js.UndefOr[AuthorMetadata | Null] = js.native
  
  /**
    * The electron-builder configuration.
    */
  val build: js.UndefOr[Configuration] = js.native
  
  /** @private */
  val dependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The application description.
    */
  val description: js.UndefOr[String] = js.native
  
  /**
    * The url to the project [homepage](https://docs.npmjs.com/files/package.json#homepage) (NuGet Package `projectUrl` (optional) or Linux Package URL (required)).
    *
    * If not specified and your project repository is public on GitHub, it will be `https://github.com/${user}/${project}` by default.
    */
  val homepage: js.UndefOr[String | Null] = js.native
  
  /**
    * *linux-only.* The [license](https://docs.npmjs.com/files/package.json#license) name.
    */
  val license: js.UndefOr[String | Null] = js.native
  
  /** @private */
  val main: js.UndefOr[String | Null] = js.native
  
  /**
    * The application name.
    * @required
    */
  val name: js.UndefOr[String] = js.native
  
  /** @private */
  val productName: js.UndefOr[String | Null] = js.native
  
  /**
    * The [repository](https://docs.npmjs.com/files/package.json#repository).
    */
  val repository: js.UndefOr[String | RepositoryInfo | Null] = js.native
  
  /** @private */
  val shortVersion: js.UndefOr[String | Null] = js.native
  
  /** @private */
  val shortVersionWindows: js.UndefOr[String | Null] = js.native
  
  /** @private */
  val version: js.UndefOr[String] = js.native
}
object Metadata {
  
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: AuthorMetadata): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setAuthorNull: Self = this.set("author", null)
    
    @scala.inline
    def setBuild(value: Configuration): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    
    @scala.inline
    def setHomepageNull: Self = this.set("homepage", null)
    
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    
    @scala.inline
    def setLicenseNull: Self = this.set("license", null)
    
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setMainNull: Self = this.set("main", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    
    @scala.inline
    def setProductNameNull: Self = this.set("productName", null)
    
    @scala.inline
    def setRepository(value: String | RepositoryInfo): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setRepositoryNull: Self = this.set("repository", null)
    
    @scala.inline
    def setShortVersion(value: String): Self = this.set("shortVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortVersion: Self = this.set("shortVersion", js.undefined)
    
    @scala.inline
    def setShortVersionNull: Self = this.set("shortVersion", null)
    
    @scala.inline
    def setShortVersionWindows(value: String): Self = this.set("shortVersionWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortVersionWindows: Self = this.set("shortVersionWindows", js.undefined)
    
    @scala.inline
    def setShortVersionWindowsNull: Self = this.set("shortVersionWindows", null)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
