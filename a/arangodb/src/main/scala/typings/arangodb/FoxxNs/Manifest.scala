package typings.arangodb.FoxxNs

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.Anon_TypeUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  var author: String
  var configuration: js.UndefOr[StringDictionary[ConfigurationDefinition]] = js.undefined
  var contributors: js.UndefOr[js.Array[_]] = js.undefined
  var defaultDocument: js.UndefOr[String] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[DependencyDefinition]] = js.undefined
  var description: String
  var engines: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var files: js.UndefOr[StringDictionary[AssetDefinition]] = js.undefined
  var keywords: js.UndefOr[String] = js.undefined
  var lib: String
  var license: js.UndefOr[String] = js.undefined
  var main: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var provides: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var repository: js.UndefOr[Anon_TypeUrl] = js.undefined
  var scripts: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var tests: js.UndefOr[js.Array[String]] = js.undefined
  var thumbnail: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Manifest {
  @scala.inline
  def apply(
    author: String,
    description: String,
    lib: String,
    configuration: StringDictionary[ConfigurationDefinition] = null,
    contributors: js.Array[_] = null,
    defaultDocument: String = null,
    dependencies: StringDictionary[DependencyDefinition] = null,
    engines: StringDictionary[js.UndefOr[String]] = null,
    files: StringDictionary[AssetDefinition] = null,
    keywords: String = null,
    license: String = null,
    main: String = null,
    name: String = null,
    provides: StringDictionary[js.UndefOr[String]] = null,
    repository: Anon_TypeUrl = null,
    scripts: StringDictionary[js.UndefOr[String]] = null,
    tests: js.Array[String] = null,
    thumbnail: String = null,
    version: String = null
  ): Manifest = {
    val __obj = js.Dynamic.literal(author = author, description = description, lib = lib)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (defaultDocument != null) __obj.updateDynamic("defaultDocument")(defaultDocument)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (engines != null) __obj.updateDynamic("engines")(engines)
    if (files != null) __obj.updateDynamic("files")(files)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (license != null) __obj.updateDynamic("license")(license)
    if (main != null) __obj.updateDynamic("main")(main)
    if (name != null) __obj.updateDynamic("name")(name)
    if (provides != null) __obj.updateDynamic("provides")(provides)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (tests != null) __obj.updateDynamic("tests")(tests)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Manifest]
  }
}

