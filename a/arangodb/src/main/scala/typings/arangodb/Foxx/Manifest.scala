package typings.arangodb.Foxx

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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (defaultDocument != null) __obj.updateDynamic("defaultDocument")(defaultDocument.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (provides != null) __obj.updateDynamic("provides")(provides.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (tests != null) __obj.updateDynamic("tests")(tests.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

