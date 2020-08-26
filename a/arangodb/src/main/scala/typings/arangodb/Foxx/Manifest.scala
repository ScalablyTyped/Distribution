package typings.arangodb.Foxx

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manifest extends js.Object {
  var author: String = js.native
  var configuration: js.UndefOr[StringDictionary[ConfigurationDefinition]] = js.native
  var contributors: js.UndefOr[js.Array[_]] = js.native
  var defaultDocument: js.UndefOr[String] = js.native
  var dependencies: js.UndefOr[StringDictionary[DependencyDefinition]] = js.native
  var description: String = js.native
  var engines: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var files: js.UndefOr[StringDictionary[AssetDefinition]] = js.native
  var keywords: js.UndefOr[String] = js.native
  var lib: String = js.native
  var license: js.UndefOr[String] = js.native
  var main: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var provides: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var repository: js.UndefOr[Type] = js.native
  var scripts: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var tests: js.UndefOr[js.Array[String]] = js.native
  var thumbnail: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object Manifest {
  @scala.inline
  def apply(author: String, description: String, lib: String): Manifest = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setLib(value: String): Self = this.set("lib", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfiguration(value: StringDictionary[ConfigurationDefinition]): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setContributorsVarargs(value: js.Any*): Self = this.set("contributors", js.Array(value :_*))
    @scala.inline
    def setContributors(value: js.Array[_]): Self = this.set("contributors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContributors: Self = this.set("contributors", js.undefined)
    @scala.inline
    def setDefaultDocument(value: String): Self = this.set("defaultDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDocument: Self = this.set("defaultDocument", js.undefined)
    @scala.inline
    def setDependencies(value: StringDictionary[DependencyDefinition]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setEngines(value: StringDictionary[js.UndefOr[String]]): Self = this.set("engines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngines: Self = this.set("engines", js.undefined)
    @scala.inline
    def setFiles(value: StringDictionary[AssetDefinition]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProvides(value: StringDictionary[js.UndefOr[String]]): Self = this.set("provides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvides: Self = this.set("provides", js.undefined)
    @scala.inline
    def setRepository(value: Type): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    @scala.inline
    def setScripts(value: StringDictionary[js.UndefOr[String]]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    @scala.inline
    def setTestsVarargs(value: String*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: js.Array[String]): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTests: Self = this.set("tests", js.undefined)
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

