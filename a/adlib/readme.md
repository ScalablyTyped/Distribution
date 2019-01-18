```
// Type definitions for adlib 3.0
// Project: https://github.com/Esri/adlib
// Definitions by: Esri <https://github.com/Esri>
//                 Mike Tschudi <https://github.com/MikeTschudi>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.1
/*
 | Copyright 2018 Esri
 |
 | Licensed under the Apache License, Version 2.0 (the "License");
 | you may not use this file except in compliance with the License.
 | You may obtain a copy of the License at
 |
 |    http://www.apache.org/licenses/LICENSE-2.0
 |
 | Unless required by applicable law or agreed to in writing, software
 | distributed under the License is distributed on an "AS IS" BASIS,
 | WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 | See the License for the specific language governing permissions and
 | limitations under the License.
 */

/**
 * Transform function to apply to interpolated value.
 *
 * @param key Path within a handlebar-style expression to attempt to replace; e.g., `s.animal.type` in
 * https://github.com/Esri/adlib#transforms
 * @param value Value to replace expression with
 * @param settings Hash providing values to insert into template; see https://github.com/Esri/adlib#general-pattern
 * @param param  Parameter for transform function; e.g., the `optional` transform accepts a count of levels
 * to delete if the value is not found (default is 0--just the current level);
 * see https://github.com/Esri/adlib#optional-transform
 */
```