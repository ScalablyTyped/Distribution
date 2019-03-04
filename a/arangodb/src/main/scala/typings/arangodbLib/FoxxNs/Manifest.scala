package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  var author: java.lang.String
  var configuration: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ConfigurationDefinition]] = js.undefined
  var contributors: js.UndefOr[js.Array[_]] = js.undefined
  var defaultDocument: js.UndefOr[java.lang.String] = js.undefined
  var dependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[DependencyDefinition]] = js.undefined
  var description: java.lang.String
  var engines: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var files: js.UndefOr[org.scalablytyped.runtime.StringDictionary[AssetDefinition]] = js.undefined
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  var lib: java.lang.String
  var license: js.UndefOr[java.lang.String] = js.undefined
  var main: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var provides: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var repository: js.UndefOr[arangodbLib.Anon_TypeUrl] = js.undefined
  var scripts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var tests: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var thumbnail: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Manifest {
  @scala.inline
  def apply(
    author: java.lang.String,
    description: java.lang.String,
    lib: java.lang.String,
    configuration: org.scalablytyped.runtime.StringDictionary[ConfigurationDefinition] = null,
    contributors: js.Array[_] = null,
    defaultDocument: java.lang.String = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[DependencyDefinition] = null,
    engines: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    files: org.scalablytyped.runtime.StringDictionary[AssetDefinition] = null,
    keywords: java.lang.String = null,
    license: java.lang.String = null,
    main: java.lang.String = null,
    name: java.lang.String = null,
    provides: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    repository: arangodbLib.Anon_TypeUrl = null,
    scripts: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    tests: js.Array[java.lang.String] = null,
    thumbnail: java.lang.String = null,
    version: java.lang.String = null
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

