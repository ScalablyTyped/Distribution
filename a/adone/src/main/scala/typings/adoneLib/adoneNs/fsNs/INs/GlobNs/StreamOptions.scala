package typings
package adoneLib.adoneNs.fsNs.INs.GlobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends Options {
  /**
    * Add the index of the matching pattern to the result
    */
  var patternIndex: js.UndefOr[scala.Boolean] = js.undefined
}

object StreamOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    cache: nodeLib.Map[java.lang.String, java.lang.String] = null,
    cwd: java.lang.String = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String | js.Array[java.lang.String] = null,
    mark: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    nodir: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    nomount: js.UndefOr[scala.Boolean] = js.undefined,
    nonull: js.UndefOr[scala.Boolean] = js.undefined,
    nosort: js.UndefOr[scala.Boolean] = js.undefined,
    nounique: js.UndefOr[scala.Boolean] = js.undefined,
    patternIndex: js.UndefOr[scala.Boolean] = js.undefined,
    realpath: js.UndefOr[scala.Boolean] = js.undefined,
    realpathCache: nodeLib.Map[java.lang.String, java.lang.String] = null,
    root: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    stat: js.UndefOr[scala.Boolean] = js.undefined,
    statCache: nodeLib.Map[java.lang.String, adoneLib.adoneNs.fsNs.INs.Stats] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    symlinks: js.Object = null
  ): StreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nomount)) __obj.updateDynamic("nomount")(nomount)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort)
    if (!js.isUndefined(nounique)) __obj.updateDynamic("nounique")(nounique)
    if (!js.isUndefined(patternIndex)) __obj.updateDynamic("patternIndex")(patternIndex)
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat)
    if (statCache != null) __obj.updateDynamic("statCache")(statCache)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks)
    __obj.asInstanceOf[StreamOptions]
  }
}

