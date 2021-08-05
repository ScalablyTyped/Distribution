package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  trait AuthorMetadata extends StObject {
    
    val email: js.UndefOr[String] = js.undefined
    
    val name: String
  }
  object AuthorMetadata {
    
    inline def apply(name: String): AuthorMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorMetadata]
    }
    
    extension [Self <: AuthorMetadata](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    val author: js.UndefOr[AuthorMetadata | Null] = js.undefined
    
    /**
      * The electron-builder configuration.
      */
    val build: js.UndefOr[Configuration] = js.undefined
    
    /** @private */
    val dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The application description.
      */
    val description: js.UndefOr[String] = js.undefined
    
    /**
      * The url to the project [homepage](https://docs.npmjs.com/files/package.json#homepage) (NuGet Package `projectUrl` (optional) or Linux Package URL (required)).
      *
      * If not specified and your project repository is public on GitHub, it will be `https://github.com/${user}/${project}` by default.
      */
    val homepage: js.UndefOr[String | Null] = js.undefined
    
    /**
      * *linux-only.* The [license](https://docs.npmjs.com/files/package.json#license) name.
      */
    val license: js.UndefOr[String | Null] = js.undefined
    
    /** @private */
    val main: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The application name.
      * @required
      */
    val name: js.UndefOr[String] = js.undefined
    
    /** @private */
    val productName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The [repository](https://docs.npmjs.com/files/package.json#repository).
      */
    val repository: js.UndefOr[String | RepositoryInfo | Null] = js.undefined
    
    /** @private */
    val shortVersion: js.UndefOr[String | Null] = js.undefined
    
    /** @private */
    val shortVersionWindows: js.UndefOr[String | Null] = js.undefined
    
    /** @private */
    val version: js.UndefOr[String] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setAuthor(value: AuthorMetadata): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorNull: Self = StObject.set(x, "author", null)
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBuild(value: Configuration): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      inline def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageNull: Self = StObject.set(x, "homepage", null)
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseNull: Self = StObject.set(x, "license", null)
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainNull: Self = StObject.set(x, "main", null)
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
      
      inline def setProductNameNull: Self = StObject.set(x, "productName", null)
      
      inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
      
      inline def setRepository(value: String | RepositoryInfo): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setShortVersion(value: String): Self = StObject.set(x, "shortVersion", value.asInstanceOf[js.Any])
      
      inline def setShortVersionNull: Self = StObject.set(x, "shortVersion", null)
      
      inline def setShortVersionUndefined: Self = StObject.set(x, "shortVersion", js.undefined)
      
      inline def setShortVersionWindows(value: String): Self = StObject.set(x, "shortVersionWindows", value.asInstanceOf[js.Any])
      
      inline def setShortVersionWindowsNull: Self = StObject.set(x, "shortVersionWindows", null)
      
      inline def setShortVersionWindowsUndefined: Self = StObject.set(x, "shortVersionWindows", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait RepositoryInfo extends StObject {
    
    val url: String
  }
  object RepositoryInfo {
    
    inline def apply(url: String): RepositoryInfo = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryInfo]
    }
    
    extension [Self <: RepositoryInfo](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
