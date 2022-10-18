package typings.angularCli.anon

import typings.angularCli.srcUtilitiesPackageMetadataMod.PackageManifest
import typings.pacote.anon.Created
import typings.pacote.anon.Directory
import typings.pacote.anon.Email
import typings.pacote.anon.Latest
import typings.pacote.mod.Person
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@angular/cli.@angular/cli/src/utilities/package-metadata.NpmRepositoryPackageJson> */
trait PartialNpmRepositoryPacka extends StObject {
  
  var author: js.UndefOr[Person] = js.undefined
  
  var bugs: js.UndefOr[Email] = js.undefined
  
  var contributors: js.UndefOr[js.Array[Person]] = js.undefined
  
  var `dist-tags`: js.UndefOr[Latest & (Record[String, String])] = js.undefined
  
  var homepage: js.UndefOr[String] = js.undefined
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  var license: js.UndefOr[String] = js.undefined
  
  var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `ng-add`: js.UndefOr[Save] = js.undefined
  
  var `ng-update`: js.UndefOr[Migrations] = js.undefined
  
  var readme: js.UndefOr[String] = js.undefined
  
  var readmeFilename: js.UndefOr[String] = js.undefined
  
  var repository: js.UndefOr[Directory] = js.undefined
  
  var requestedName: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[Record[String, PackageManifest]] = js.undefined
  
  var time: js.UndefOr[(Record[String, String]) & Created] = js.undefined
  
  var users: js.UndefOr[Record[String, Boolean]] = js.undefined
  
  var versions: js.UndefOr[Record[String, PackageManifest]] = js.undefined
}
object PartialNpmRepositoryPacka {
  
  inline def apply(): PartialNpmRepositoryPacka = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNpmRepositoryPacka]
  }
  
  extension [Self <: PartialNpmRepositoryPacka](x: Self) {
    
    inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBugs(value: Email): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
    
    inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
    
    inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value*))
    
    inline def `setDist-tags`(value: Latest & (Record[String, String])): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
    
    inline def `setDist-tagsUndefined`: Self = StObject.set(x, "dist-tags", js.undefined)
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
    
    inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
    
    inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def `setNg-add`(value: Save): Self = StObject.set(x, "ng-add", value.asInstanceOf[js.Any])
    
    inline def `setNg-addUndefined`: Self = StObject.set(x, "ng-add", js.undefined)
    
    inline def `setNg-update`(value: Migrations): Self = StObject.set(x, "ng-update", value.asInstanceOf[js.Any])
    
    inline def `setNg-updateUndefined`: Self = StObject.set(x, "ng-update", js.undefined)
    
    inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setReadmeFilename(value: String): Self = StObject.set(x, "readmeFilename", value.asInstanceOf[js.Any])
    
    inline def setReadmeFilenameUndefined: Self = StObject.set(x, "readmeFilename", js.undefined)
    
    inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
    
    inline def setRepository(value: Directory): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRequestedName(value: String): Self = StObject.set(x, "requestedName", value.asInstanceOf[js.Any])
    
    inline def setRequestedNameUndefined: Self = StObject.set(x, "requestedName", js.undefined)
    
    inline def setTags(value: Record[String, PackageManifest]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTime(value: (Record[String, String]) & Created): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setUsers(value: Record[String, Boolean]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setVersions(value: Record[String, PackageManifest]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
  }
}
